Bu proje ile adaptor yapısal kalıbı anlatılmaktadır. 
Bunu kullanırkende:

A.powerSs : Güç kaynaklarının bölümüfür.
	1. IPowerSource.java	: Interface'dir getVoltage methoduna sahiptir.
	2. Socket220V.java		: IPowerSource üzerinden türetilir. değeri 220V olarak methodda ayarlanır. 

B.directlyHomeEquipment : 220V ile calisacak ev aletlerinin bölümüdür.
	1. IAppliance.java	: turnOn methoduna sahiptir. Ev aletlerini bu arayüz üzerinden işletilir ve çalışmasını bunun methodundan yapar
	2. Iron.java		: 220V elektirikli ev aletidir.
	3. Refrigerator.java: 220V elektirikli ev aletidir.
	
C.depentAdaptorHomeEq: 220V direkt kullanamayan bir adaptor mekanizması ile çalışan aletlerdir.
	1. Phone.java	: 5V elektirikli ev aletidir.

D. adaptor	: 220V dan 5V dönüşümünün yapıldığı adaptor kısmıdır. 
	1.VoltageAdaptor5V: 220V dan 5V dönüşümü yapar.

E. Manager.java	: çalışmayı icraa eder.
a. 220V priz üretme : IPowerSource (A-1) ile socket oluşturur. Bu 220V verir.
b. 220V cihaz üretme : Iron (B-2) & Refrigerator (B3) ile 220V alet üretip kendi içlerinde devreye alır.
c. 5V cihaz üretme: Phone(C-1) ile 5V ile çalışan cihaz üretir.
d. adaptor üretme : VoltageAdaptor5V (D-1) ile adator üretir.
e. (c) kullanmak icin (d) işletimi yaparak (c)çalıştırır.


Burada amaç çok basit bir örnek ile adaptor tasarım örüntüsünü anlatmaktır. 220V ile çalışan güç aile içinde deişiklik yapmadan 5V ile çalışan cihazın sistee dahil olması sağlanmıştır.