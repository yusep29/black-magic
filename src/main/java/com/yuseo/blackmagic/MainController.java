package com.yuseo.blackmagic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api")
public class MainController {

    private boolean AUTO_RESET = true;

    @GetMapping(value = "/change-url/{text}")
    public String changeUrl(@PathVariable(name = "text") String text) {
        try {
            text = text.replace(" ", "+");
            FileWriter myWriter = new FileWriter("D:\\programming\\xampp\\htdocs\\a\\1.html");
            myWriter.write("<html>\n" +
                    "    <head>\n" +
                    "        <<meta http-equiv=\"refresh\" content=\"1;url=https://www.google.com/search?q="+text+"\" />\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <h1> </h1>\n" +
                    "    </body>\n" +
                    "</html>");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            return "Success";
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "Failed";
        } finally {
            if (AUTO_RESET){
                try {
                    TimeUnit.SECONDS.sleep(5);
                    reset();
                } catch (Exception e){
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        }
    }

    @GetMapping(value = "/reset")
    public String reset() {
        try {
            FileWriter myWriter = new FileWriter("D:\\programming\\xampp\\htdocs\\a\\1.html");
            myWriter.write("<html>\n" +
                    "    <head>\n" +
                    "        <meta http-equiv=\"refresh\" content=\"1;url=http://192.168.1.9/a/1.html\" />\n" +
                    "        <!-- <meta http-equiv=\"refresh\" content=\"3;url=https://www.google.com/search?q=ubah+ini\" /> -->\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <h1> </h1>\n" +
                    "    </body>\n" +
                    "</html>");
            myWriter.close();
            System.out.println("Successfully reset the file.");
            return "Success";
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "Failed";
        }
    }
}
