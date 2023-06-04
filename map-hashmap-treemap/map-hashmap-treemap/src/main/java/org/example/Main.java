package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, Product> productsByName = new HashMap<>();
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        System.out.println(productsByName.get("E-Bike").getDescription());

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        TreeMap nonGeneric = new TreeMap();
        TreeMap <String,Integer> generic = new TreeMap<>();

        ///---> Değişken Tanımlaması <---\\\
        String ayrac = new String(new char[15]).replace("\0", "-");
        ///---> Non-Generic TreeMap Tanımlaması <---\\\
        TreeMap methods = new TreeMap();
        ///---> TreeMap Metotlarını Kullanmak için Veri Girişi Yapalım <---\\\
        methods.put("Cat","Kedi");
        methods.put("Dog","Köpek");
        methods.put("Bird","Kuş");
        methods.put("Giraffe","Zürafa");
        methods.put("Lion","Aslan");
        ///---> TreeMap Metotlarını Kullanmaya Başlayalım <---\\\
        System.out.println(ayrac+"\n< Java TreeMap Metotları >\n"+ayrac);
        System.out.println("-> Eşleşen Veriler (entrySet): " + methods.entrySet()+"\n-> Yapı Uzunluğu (size) : "+ methods.size()+"\n"+ayrac);
        System.out.println("-> Yapı İçerisindeki İlk Eşleşme (firstEntry): "+ methods.firstEntry());
        System.out.println("-> Yapı İçerisindeki Son Anahtar (lastKey): "+ methods.lastKey());
        System.out.println("-> \"Bird\" Anahtarını Silelim (remove): " + methods.remove("Bird"));
        System.out.println("-> Yeni Yapı Uzunluğu: "+ methods.size());
        System.out.println("-> CelingEntry(\"Bird\") Metodunu Kullanalım: " + methods.ceilingEntry("Bird"));
        System.out.println("-> Comparator Metodunun Kullanımı: " + methods.comparator()+"\n"+ayrac);

        ///---> Değişken Tanımlaması <---\\\
        String ayrac2 = new String(new char[15]).replace("\0", "-");
        ///---> Generic TreeMap Tanımlaması <---\\\
        TreeMap <Integer,Integer> mathGeneric = new TreeMap<>();
        ///---> Gerekli Değişkenler ve Scanner Sınıfının Tanımlaması <---\\\
        int puan = 0 , dogru = 0, yanlis = 0, degisim = 0, tahmin;
        Scanner scanner = new Scanner(System.in);
        ///---> Oyun Yapımız İçin Veri Girişi Tanımlayalım <---\\\
        for(int i = 1 ; i <= 10; i++)
            mathGeneric.put(i,(i*i));
        ///---> Oyunumuzun Sistemini Kuralım <---\\\
        System.out.println(ayrac+"\n< Java TreeMap Örnekleri >\n"+ayrac);
        for(int i= 1 ; i <= mathGeneric.size() ; i++){
            if(degisim <= 2 || degisim >= 4){
                if(dogru > 1  && dogru <= 2){
                    if(i==3) {
                        System.out.print("-> ["+(mathGeneric.get(i))+"] Değerin Karesi Kaçtır: ");
                        tahmin = Integer.parseInt(scanner.next());
                        if (tahmin == mathGeneric.get(i) * mathGeneric.get(i)) {
                            dogru++;
                            puan += 100;
                        } else {
                            yanlis++;
                            puan -= 100;
                        }
                    }
                }
                else if(dogru == 3 || dogru >= 5 && dogru <= 8){
                    System.out.print("-> ["+mathGeneric.lastKey()+"] Değerinin Karesi Kaçtır: " );
                    tahmin = Integer.parseInt(scanner.next());
                    if(tahmin == (mathGeneric.lastKey()*mathGeneric.lastKey())){
                        dogru++;
                        puan += 100;
                    }
                    else{
                        yanlis++;
                        puan -= 100;
                    }
                    mathGeneric.remove(mathGeneric.lastKey());
                    i -= 1;
                }
                else{
                    System.out.print("-> ["+mathGeneric.get(i)+"] Değerine Hangi Rakamın Karesi İle Ulaşılır: ");
                    tahmin = Integer.parseInt(scanner.next());
                    if(tahmin == i){
                        dogru++;
                        puan += 100;
                    }
                    else{
                        yanlis++;
                        puan -= 100;
                    }
                }
            }
            else{
                System.out.print("-> ["+mathGeneric.get(i)+"] Değerine Hangi Rakamın Karesi İle Ulaşılır: ");
                tahmin = Integer.parseInt(scanner.next());
                if(tahmin == i){
                    dogru++;
                    puan += 100;
                }
                else{
                    yanlis++;
                    puan -= 100;
                }
            }
            degisim++;
            if(degisim > 6){
                degisim = 0;
            }
        }
        System.out.println(ayrac+"\n-> Doğru Sayısı: "+ dogru+"\n-> Yanlış Sayısı: " + yanlis + "\n-> Puanınız: "+puan+"\n"+ayrac);
    }
    }
