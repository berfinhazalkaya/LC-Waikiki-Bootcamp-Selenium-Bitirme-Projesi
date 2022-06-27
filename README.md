# LC-Waikiki-Bootcamp-Selenium-Bitirme-Projesi
LC Waikiki Bootcamp Web/Selenium Bitirme Projesi
 
## Projenin Senaryosu

- Bir yeni müşteri kaydı oluşturulacak.
- Login olduktan sonra
- Kategoriler-->Kadın-->Giyim-->Bluz bölümüne girip
- Filtreleme bölümünden renk seçeneği siyah seçilecek.
- Sonuçlar listele yapılıp ,gelen ürün sonuçlarından biri seçilip ,üstüne tıklanacak.
- Beden medium seçilecek ,sepete ekle butonuna tıklanacak
- Sepetim’e gidilecek ,ürünün adı ,adeti ,bedeni kontrol edilecek.
- Ödeme yap butonuna tıklayıp,ödeme ekranına gidildiği ,doğru ekrana yönlendiği kontrol edilecek.

## Kullanılan Teknolojiler

- Java (Projenin yazılmış olduğu kodlama dilidir)
- TestNG(Test Caselerin yazılması ve çıktıların kontrollerinde kullanılan Test Yazım Aracıdır)
- Selenium (Web Sitesini test etmek için kullanılan Test Otomasyon Aracıdır)
- Page Object Pattern (Projede kullanılan mimari yapıdır)
- Maven (Genellikle Java platformunda yer alan komutların derlenmesi sırasında kullanılan otomasyon ve inşa aracıdır)
- Cucumber(Cucumber, BDD (Behavior Driven Developmet) destekli bir test otomasyon yaklaşımıdır)
- Gherkin (Gherkin bir plain-text language’dir. Yazılımcı olmayan kişiler tarafından öğrenilebilecek şekilde tasarlanmıştır)


## Projenin Ayağa Kaldırılması
- src/test/resources/testSuites/Parallel.xml dosyasından çalıştırılmalıdır.

Ayrıca projede doğru senaryoyla yeni kayıt oluşturma ve yanlış senaryoyla yeni kayıt oluşturma adımları da gösterilmiştir. Bu kısımları da çalıştırmak için src/main/testRunners/runner dosyasındaki tags kısmı yorum satırına alınmalıdır.
