package org.example.creational.SingletonDesignPattern;

public class MySingletonClass {


    private static MySingletonClass mySingletonClass = null;

    private MySingletonClass(){}


//    public static synchronized MySingletonClass getInstance(){
//
//        if(mySingletonClass == null){
//            mySingletonClass =  new MySingletonClass();
//        }
//        return mySingletonClass;
//    }

    public static MySingletonClass getInstance(){
        if (mySingletonClass == null) {
            synchronized (MySingletonClass.class) {
                if (mySingletonClass == null) {
                    mySingletonClass = new MySingletonClass();
                }
            }
        }
        return mySingletonClass;
    }

    //Double-Checked Locking: The getInstance() method first checks if mySingleton is null.
    // If it is, it synchronizes on the class object (MySingleton.class). Inside the synchronized block,
    // it checks again if mySingleton is still null (to prevent multiple instantiations in a
    // multithreaded environment) and creates the instance if it is.
}
