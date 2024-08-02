# HouseManager

HouseManager, farklı türdeki evleri (Ev, Villa, Yazlık) yönetmek ve bu evlerle ilgili çeşitli işlemleri gerçekleştirmek için geliştirilmiş bir Java uygulamasıdır.

## İçindekiler

- [Özellikler](#özellikler)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)
- [Proje Yapısı](#proje-yapısı)
- [Katkıda Bulunma](#katkıda-bulunma)
- [Lisans](#lisans)

## Özellikler

- **Ev Türleri Yönetimi**: Ev, Villa ve Yazlık türlerini temsil eden sınıflar ve bu sınıfların örneklerini oluşturma.
- **Fiyat Hesaplamaları**: Her ev türü için toplam fiyat hesaplama.
- **Metrekare Hesaplamaları**: Her ev türü için ortalama metrekare hesaplama.
- **Filtreleme**: Oda ve salon sayısına göre evleri filtreleme.

### Mevcut Metotlar

- `getTotalPriceOfEvs()`: Evlerin toplam fiyatını döner.
- `getTotalPriceOfVillas()`: Villaların toplam fiyatını döner.
- `getTotalPriceOfYazliks()`: Yazlıkların toplam fiyatını döner.
- `getTotalPriceOfAllHouses()`: Tüm evlerin toplam fiyatını döner.
- `getAverageSizeOfEvs()`: Evlerin ortalama metrekaresini döner.
- `getAverageSizeOfVillas()`: Villaların ortalama metrekaresini döner.
- `getAverageSizeOfYazliks()`: Yazlıkların ortalama metrekaresini döner.
- `getAverageSizeOfAllHouses()`: Tüm evlerin ortalama metrekaresini döner.
- `filterHousesByRoomsAndHalls(int rooms, int halls)`: Belirli oda ve salon sayısına göre evleri filtreler.

## Kurulum

Projeyi klonlayarak başlayın:

```bash
git clone https://github.com/BeyzaNurEkiz/house-manager.git
cd house-manager
