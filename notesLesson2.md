# Lesson #2

Hata alındığında tek tek hata sorgulaması yapmak yerine direkt hatanın yeri bulunabilir.

Bunun için *Charles* Uygulaması kullanılabilir.
* [Charles](https://www.charlesproxy.com/download/latest-release/) 

**➡ ⇒ ⇨ &rarr;** Peki nedir bu Charles?
* Charles, bir geliştiricinin makineleri ile İnternet arasındaki tüm HTTP ve SSL / HTTPS trafiğini görüntülemesini sağlayan bir HTTP proxy / HTTP izleyici / Ters Proxy'dir. 
* Buna istekler, yanıtlar ve HTTP üstbilgileri dahildir (çerezleri ve önbelleğe alma bilgilerini içerir).

**➡ ⇒ ⇨ &rarr;** Proxy Nedir ?
* "Vekil sunucu" ya da "ara sunucu" olarak da bilinen Proxy, bağlanmak istediğiniz siteye başka bir kanal kullanarak geçmenize yarayan bir araçtır.

<hr style="border:5px solid dodgerblue">

🔷 Şirketlerde belirlenen Test Case'ler için Cucumber kullanılabilir.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹 Bunun için Cucumber kullanılır veya Excel tercih edilir.\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔹 Bunun amacı hem Clean Code olsun hem de daha sonraki inceleme yapan herhangi bir çalışan ne yapıldığını rahatça anlaması içindir.

🔶 **Smoke - Sanity - Regression Testleri**\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 ***Smoke (Duman) Testi*** \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Proje ilk oluşturulduğunda çok derine inilmeden sığ biçimde yapılan testtir. \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Küçük bir Acceptance (Kabul) testtidir. \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Uygulamanın temel, kritik fonksiyonlarının kontrol edilmesi amaçlanır. \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Bir diğer ifade ile uygulama patlıyor mu çalışıyor mu testi denebilir. \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Ör. Login fonksiyonu çalışıyor mu diye kontrol edilir ama ekrandaki başlık doğru mu diye bakılmaz \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 ***Sanity (Doğruluk) Testi*** \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Uygulamaya yeni bir özellik getirildiğinde özelliğin çalışma durumunun kontrol edildiği testtir. \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Smoke Testinin biraz daha geniş halidir ancak olumsuz senaryolar hiç incelenmez. \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Regresyon Testinin bir alt kümesi olarak ifade edilebilir. \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 ***Regression (Tekrar) Testi*** \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 🔸 Uygulamaya eklenen yeni bir özelliğin ve değişikliğin çalışırken bir yandan da mevcut özellikleri olumsuz olarak etkilemediğini doğrulamak için yapılan bir testtir.

<hr style="border:5px solid dodgerblue">

## Uygulama Notları

* TestNG'de bulunan notasyonlar Intellij Idea'da kod yazarken src/test klasörü altındaki kodlarda çalışıyor.
  * Bu sayede Clean Code mantığına da uygun biçimde kodlar yazılmış oluyor.

* Eğer telefondaki uygulamaların tam olarak paket isimlerine ulaşılmak istenirse Emulatöre APK Pure benzeri bir uygulama yüklenmelidir.
  * Bu sayede telefondaki bütün uygulamaların paket isimleri elde edilebilir.
  * Uygulama sırasında [Package List](https://apkpure.com/package-list/me.iofel.packagelist) uygulamasını kullandık.

* Kod yazımında Driver belirtip, URL ifadesini yazdık.
  * Driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);
    * Burada dikkat edilmesi gereken nokta eğer *https* şeklinde yazılırsa hata alınacaktır.
    * Appium Server SSL olmayan bir sunucuda çalışırken yapılan istekde SSL bulunuyor.
    * Bu sebeple *http* şeklinde bir istek yapılmalıdır.

* Appium dependency'ler için direkt olarak [Java Client](https://mvnrepository.com/artifact/io.appium/java-client/4.1.2) kullandık.

<hr style="border:5px solid dodgerblue">

## References

* [Proxy Nedir?](https://www.milleni.com.tr/blog/teknik/proxy-nedir)
* [Smoke - Sanity Testleri](https://www.benimuhendisim.com/smoke-duman-testi-vs-sanity-dogruluk-testi/)
* [What is Regression Testing?](https://www.guru99.com/regression-testing.html)
* [Guru 99 - APPIUM Tutorial for Android & iOS Mobile Apps Testing](https://www.guru99.com/introduction-to-appium.html)