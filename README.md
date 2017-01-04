# Android-Copy-Database
copy SQLite Database from Assets folder into Android Internal Storage Database Location

Description
----
A simple Android Application Template that copies the Database from Assets Folder into Internal Storage Database Location.

Usefulness
----
1. When you dont want to create Database using code
2. When you want to use already filled Database

How to use **Your Database**
----
1. Assets Folder
  1. Delete DB_CATEGORY.sqlite in [Assets Folder](https://github.com/shanraisshan/Android-Copy-Database/tree/master/app/src/main/assets)
  2. Copy **Your Database** in Assets Folder
2. Code
  1. Replace **Your Database** name with "DB_CATEGORY.sqlite" in [DBHelper class](https://github.com/shanraisshan/Android-Copy-Database/blob/master/app/src/main/java/com/adt/database/DBHelper.java)
  2. Query **Your Database** from [DBQuery class](https://github.com/shanraisshan/Android-Copy-Database/blob/master/app/src/main/java/com/adt/database/DBQuery.java) accordingly
  3. db.getCategories(0) in [Activity1 class](https://github.com/shanraisshan/Android-Copy-Database/blob/master/app/src/main/java/com/adt/Activity1.java) is developed for current database, change that method according to **Your Database**

----
Requires Android
----
Compatible with Android 2.3 (GINGERBREAD - 9) and above.

