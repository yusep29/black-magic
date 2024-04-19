# Sulap Menebak Pikiran Penonton

Aplikasi yang dibutuhkan :
- intellij
- xampp


setup awal :
- copy 1.html dan 2.html pada resources ke folder "...\xampp\htdocs\a" (buat folder dengan nama "a")
- connect komputer anda ke wifi yang anda miliki
- run black-magic via intellij dan modul apache via xampp
- cek ip komputer yang dipakai dan anda harus mengingat ip ini, contoh : 192.168.1.9
- asisten membuka halaman web asisten  http://192.168.1.9/a/2.html


cara main:
1.  pinjam hp penonton lalu minta dia buka browser
2.  connect ke wifi yang sudah anda siapkan secara sembunyi-sembunyi dengan berpura - pura sedang mencari sesuatu di browser
3.  buka http://192.168.1.9/a/1.html dengan berpura-pura sedang mengetik sesuatu di browser 
    (untuk poin 1 dan 2 jangan sampai ketahuan kalau anda sedang tidak mengetik di pencarian google melainkan melakukan hal lain)
4.  taruh handphone tersebut ke meja dengan layar menghadap kebawah sehingga tidak dapat dilihat siapapun
5.  minta penonton untuk menyebutkan kata, nama, atau apapun sesuai kreasi anda sebagai pesulap
6.  asisten mendengar kata yang diucapkan penonton dan menginput kata tersebut di halaman web asisten secara sembunyi-sembunyi
7.  hanphone penonton akan otomatis teredirect ke google dengan pencarian sesuai apa yang telah di tulis asisten
8.  bilang ke penonton bahwa anda punya kemampuan prediksi dan telah melakukan pencarian via google apa yang telah 
    disebutkan oleh penonton tadi
9.  minta penonton untuk membalik hanphonenya untuk pembuktian
10. penonton akan terkejut karena prediksi anda tepat
11. permainan selesai


cara kerja aplikasi:
1.  aplikasi terdiri dari :
    - Service black-magic sebagai pengubah html page http://192.168.1.9/a/1.html
    - /a/1.html sebagai page untuk client
    - /a/2.html sebagai page untuk asisten
1.  http://192.168.1.9/a/1.html akan melakukan redirect setiap 1 detik ke alamat dirinya sendiri
2.  ketika asisten submit kata di http://192.168.1.9/a/2.html, black-magic service akan melakukan writing ulang html 
    sehingga halaman http://192.168.1.9/a/1.html akan berubah menjadi redirect ke halaman pencarian google
    https://www.google.com/search?q=(text_yang_akan_dicari)


credit :
- sulap ini terinspirasi dari sulap milik "Pesulap Merah" di salah satu acara podcast.
- semua code saya tulis sendiri.