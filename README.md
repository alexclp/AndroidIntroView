AndroidIntroView
================

Easily create beautiful tutorials for your Android apps.

![screenshot](https://raw.github.com/vladstoick/AndroidIntroView/master/screenshots/ss1.png)

Usage 
============

Add the plugin in your project (Gradle)

```gradle
compile "com.android.support:support-v4:18.0.+"
```
Add the fragment into your activity xml

```xml
<fragment xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/introview"
    android:name="com.vladstoick.introview.IntroView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

Add the following code into your activity onCreate(). Change the IntroPage elements with suitable content.

```java
IntroView introView = (IntroView) getSupportFragmentManager().findFragmentById(R.id.introview);
introPages = new ArrayList<IntroPage>();
introPages.add(new IntroPage(getString(R.string.intro1),R.drawable.introview1));
introPages.add(new IntroPage(getString(R.string.intro2),R.drawable.introview2));
introPages.add(new IntroPage(getString(R.string.intro3),R.drawable.introview3));
introPages.add(new IntroPage(getString(R.string.intro4),R.drawable.introview4));
introView.setData(introPages);
introView.setOnSkipClickListener(this);
```

Implement IntroView.OnSkipClickListener in your activity
