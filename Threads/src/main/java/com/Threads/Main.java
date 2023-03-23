package com.Threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    private static final ThreadLocal SIMPLE_DATE_FORMAT = new ThreadLocal() {
        //ThreadLocal bir nesneyi thread safe yapmamızı sağlar. Örneğin SimpleDateFormat nesnesi thread safe değildir dolayısıyla birden fazla thread aynı anda format değişikliği yapar ve format işlemi yaparsa exception fırlatacaktır.
        //ThreadLocal ile bu nesnesi aşağıda ki örnekte görüldüğü gibi thread safe hale getirebilmekteyiz.
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("dd/MM/yyyy", new Locale("tr", "TR"));
        };
    };
    public static void main(String[] args) throws InterruptedException {
        /*{
            Thread Thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy", new Locale("tr", "TR"));
                    while (true) {
                        SIMPLE_DATE_FORMAT.set(format1);
                        System.out.println("1- ".concat(((SimpleDateFormat) SIMPLE_DATE_FORMAT.get()).format(new Date())));
                    }
                }
            });
            Thread1.start();
            Thread Thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat format2 = new SimpleDateFormat("MM/dd/yyyy", new Locale("tr", "TR"));
                    while (true) {
                        SIMPLE_DATE_FORMAT.set(format2);
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
        {
            ParentThread gfg_pt = new ParentThread();
            gfg_pt.start();
        }
    }

    static class ParentThread extends Thread {
        // anonymous inner class  for overriding childValue method.
        public static InheritableThreadLocal gfg_tl = new InheritableThreadLocal() {
            @Override
            protected Object childValue(Object parentValue) {
                return super.childValue(parentValue);
            }
        };
        public void run()
        {
            // setting the new value
            gfg_tl.set("parent data");
            // parent data
            System.out.println("Parent Thread Value :" + gfg_tl.get());

            ChildThread gfg_ct = new ChildThread();
            gfg_ct.start();
        }
    }
    static class ChildThread extends Thread {

        public void run()
        {
            // child data
            System.out.println("Child Thread Value :" + ParentThread.gfg_tl.get());
        }
    }
}