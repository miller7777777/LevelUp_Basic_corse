package com;

/**
 * Created by mille_000 on 30.11.2014.
 */
public class PhoneBook {

    public static void main(String[] args) {
        Collection book = new Collection();
        Contact c1 = new Contact("Михаил", "999111222333", "test@mail.com");
        Contact c2 = new Contact("Иван", "999111222332");

//        for (int i = 0; i < 2000; i++) {
//
//            book.add((int) (Math.random() * 100 - 50));
//        }
//        book.qSort(book.arr, 0, 1999);

//        book.add(0);
//        book.add(1);
//        book.add(2);
//        book.add(3);

//        book.remove(0);

//        c1.print();
//        c2.print();

        System.out.println("Size = " + book.size);
        for (int i = 0; i < book.size; i++) {
            System.out.println(book.arr[i]);

        }

        }

//

        }

