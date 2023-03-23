package com.Threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*{
            final ThreadLocal SIMPLE_DATE_FORMAT = new ThreadLocal();
            //ThreadLocal bir nesneyi thread safe yapmamızı sağlar. Örneğin SimpleDateFormat nesnesi thread safe değildir dolayısıyla birden fazla thread aynı anda format değişikliği yapar ve format işlemi yaparsa exception fırlatacaktır.
            //ThreadLocal ile bu nesnesi aşağıda ki örnekte görüldüğü gibi thread safe hale getirebilmekteyiz.
            //Set edilen değer sadece o thread içinde geçelidir. Yani farklı threadler için farklı obje gibi düşünülebilir.
            Thread Thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy", new Locale("tr", "TR"));
                    SIMPLE_DATE_FORMAT.set(format1);
                    while (true) {

                        System.out.println("1- ".concat(((SimpleDateFormat) SIMPLE_DATE_FORMAT.get()).format(new Date())));
                    }
                }
            });
            Thread Thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat format2 = new SimpleDateFormat("MM/dd/yyyy", new Locale("tr", "TR"));
                    SIMPLE_DATE_FORMAT.set(format2);
                    while (true) {
                        System.out.println("2- ".concat(((SimpleDateFormat) SIMPLE_DATE_FORMAT.get()).format(new Date())));
                    }
                }
            });
            Thread2.start();
        }*/

        /////////////////////

        /*{
            Thread t1 = new Thread();
            Thread t2 = new Thread();
            t1.start();
            t1.setDaemon(true);//Uygulama kapandıktan sonra thread otomatik kill olur.
            t1.join();//t1 bitmeden diğer bir thread start olmaz.
            t2.start();
            t2.join();
        }*/

        //////////

        /*{
            //InheritableThreadLocal ile bir thread'in içinde bir thread açıyorsak ve parent thread'ten local thread'a set edilen datanın child threat'a aktarılması istediğimiz şeyi parametre olark geçiyoruz.
            InheritableThreadLocal inheritThread = new InheritableThreadLocal() {
                @Override
                protected Object childValue(Object parentValue) {
                    return "child data";
                }
            };
            Thread Thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    inheritThread.set("Gorkem");
                    System.out.println(inheritThread.get());
                    Thread Thread2 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(inheritThread.get());
                        }
                    });
                    Thread2.start();
                }
            });
            Thread1.start();
        }*/
    }
}