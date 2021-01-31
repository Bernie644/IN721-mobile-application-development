# **Android Overview**

## Android Operating System
**Android** is a mobile os based on a modified version of the **Linux kernel** & primarily designed for touchscreen devices such as phones, tablets & watches. **Android** is developed by a group of developers known as the **Open Handset Alliance** or **OHA** & commercially sponsored by **Google**. **Android** is free & open-source, & its source code is known as **Android Open Source Project** or **AOSP**, which is licensed under the **Apache License**. However, most **Android** devices are shipped with pre-installed proprietary software such as **Google Mobile Services**.

### Brief History
**Android Inc.** was founded in Palo Alto, CA, in October 2003 by Andy Rubin, Rich Miller, Nick Sears & Chris White. The early intentions of the company were to develop an advanced os for digital cameras. The company then decided that the market for digital cameras was not large enough. They later pivoted, & pitched **Android** to investors as a handset os that would compete against **Symbian** & **Windows Mobile** (both discontinued). In July 2005, **Google** acquired **Android Inc.** for around $50 million. Key employees, including Rubin, Miller, Sears & White, joined **Google** as part of the acquisition. 

At **Google**, Rubin & his team developed a mobile device platform powered by the **Linux kernel**. **Google** marketed the platform to handset providers & carriers on the promise of providing a flexible, upgradeable system. In 2006, **Google's** plans to enter the mobile communications market continued. An early prototype closely resembled a **BlackBerry** phone which had a QWERTY keyboard & no touchscreen. With the unveiling of the **Apple iPhone** in 2007 meant **Android** had to go back to the drawing board. In 2008, both **Nokia** & **BlackBerry** announced touch-based smartphones that to rival the **iPhone 3G**. Subsequently, **Android** switch their focus to touchscreens. The first commercially available smartphone running **Android** was the **HTC Dream** which was announced in September 2008.

### Activity ✏️
Research & answer the following:
1. Explain what members of the **OHA** do.
2. Name 10 members of the **OHA**. Include a range of mobile operators, handset manufacturers & software companies.

Write your answers on the provided sticky note.

### Software Stack

The following image displays the major components of the **Android** platform.

<img src="./resources/readme/android-software-stack.png" alt="Android Software Stack" width="350" height="500" />

#### Linux Kernel
The **Linux kernel** is the foundation of the **Android** platform. The **Android runtime** or **ART** relies on the **Linux kernel** for underlying functionalities such as threading & memory management. It allows **Android** to take advantage of key security features & handset manufactrers to develop drivers for a well-know kernel.

#### Hardware Abstraction Layer 
The **hardware abstract layer (HAL)** provides standard interfaces that expose device hardware capabilities to the **Java API Framework**. The HAL consists of multiple library modules which implement an interface for a specific type of hardware components, i.e., the audio, bluetooth, camera or sensor module. 

#### Android Runtime
For devices running **Android 5.0** or higher, each application runs in its own process & with its own instance of the **Android Runtime**. Major features of the Anroid Runtime include ahead-of-time/just-in-time compilation & optimised garbage collection. Prior to **Android 5.0**, **Dalvik** was the **Android Runtime**. Note: if your application runs well on the **Android Runtime**, then it run well on **Dalvik**.

### Activity ✏️
Research & answer the following:
1. Explain difference between ahead-of-time & just-in-time compilation?

Write your answer on the provided sticky note.

#### Native C/C++ Libraries
Many core **Android** system components & services are built from native code that require native libraries written in **C** & **C++**. The **Android** platform provides **Java** framework APIs to expose the functionality of these native libraries to applications.

#### Java API Framework
The feature-set of the **Android** os is available through APIs written in **Java**. These APIs form the building blocks you need to create Android applications by simplifying the reuse of core, modular system components & services.

#### System Apps
**Android** comes with a set of core applications such as email, messaging, calendars, internet browsing, etc. Applications included with the platform have no special status among the applications the user chooses to install. This means that a third-party application can become the user's default messenger, web browser, etc.

The system applications function both as applications for users & to provide capabilities that developers can access from their own application.

**Resource:** https://developer.android.com/guide/platform

### Market Share
According to StatCounter, Android has been the most popular mobile os since August 2013.

<img src="./resources/readme/mobile-os-market-share.png" alt="Mobile OS Market Share" width="750" height="450" />

**Resource:** https://gs.statcounter.com/os-market-share/mobile/worldwide

## Android Studio
**Android Studio** is a cross-platform integrated development environment or IDE for the **Android** os. **Android Studio** is built on **JetBrains' IntelliJ IDEA** & designed specifically for **Android** development.

### How To Create A New Android Project
To create a new Android project, follow these steps:
1. Open **Android Studio**.
2. In the **Welcome to Android Studio** window, click **Start a new Android Studio project**.

<img src="./resources/readme/android-studio-home.png" alt="Android Studio Home" width="575" height="400" />

3. In the **Select a Project Template** window, select **Empty Activity** and click **Next**.

<img src="./resources/readme/android-studio-template.png" alt="Android Studio Template" width="650" height="475" />

4. In the **Configure Your Project** window, complete the following:
    - Enter **AgeCalculator** in the **Name** field
    - Enter **op.mobile.app.dev.age.calculator** in the **Package** name field.
    - If you would like to place the project in a different folder, change its **Save** location.
    - Select **Kotlin** from the **Language** drop-down menu.
    - Select the lowest version of **Android** your application will support in the **Minimum SDK** field.
    - If your application will require legacy library support, mark the **Use legacy android.support libraries** checkbox.
    
<img src="./resources/readme/android-studio-project.png" alt="Android Studio Project" width="650" height="475" />

5. Click **Finish**.

Lets look at some important application project files.

**app > manifest > AndroidManifest.xml**

Every application project must have an **AndroidManifest.xml** file in the root of the **app** directory. The **AndroidManifest.xml** file specifies important information about your application to the Android build tools, Android os & Google Play.

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="op.mobile.app.dev.age.calculator">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.AgeCalculator">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```

**Resource:** https://developer.android.com/guide/topics/manifest/manifest-intro

**app > java > op.mobile.app.dev.age.calculator > MainActivity**

<img src="./resources/readme/android-studio-main-activity.png" alt="Android Studio Main Activity" width="750" height="500" />

**app > res > layout**

A layout resource defines the architecture for the UI in an **Activity** or a **component** of a UI.

<img src="./resources/readme/android-studio-activity-main-xml.png" alt="Android Studio Activity Main XML" width="750" height="500" />

Currently we are in **Design** view. Click **Code**. You should see the following **XML** code:

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### Activity ✏️
Research & answer the following:
1. Explain what a **ViewGroup** is & provide three examples of a **ViewGroup** object.
2. Explain what a **View** is & provide three examples of a **View** object.

**Resource:** https://developer.android.com/guide/topics/resources/layout-resource

### ViewGroup & View Attributes

**android:id** - A unique resource name for the element which you can use to obtain a reference to the **ViewGroup**/**View** from your application.
**android:layout_height** - The height for the element as a dimension value/resource or a keyword (**match_parent** or **wrap_content**)
**android:layout_width** - The width for the element as a dimension value/resource or a keyword (**match_parent** or **wrap_content**)

### ConstraintLayout

https://developer.android.com/reference/androidx/constraintlayout/widget/ConstraintLayout

**app > res > values**

**Resources:** 
- https://developer.android.com/guide/topics/resources/color-list-resource
- https://developer.android.com/guide/topics/resources/string-resource
- https://developer.android.com/guide/topics/resources/style-resource

**Gradle Scripts > build.grade (Project: AgeCalculator)**

**Gradle Scripts > build.grade (Module: AgeCalculator.app)**

**Gradle Scripts > local.properties**

## Practical
The practical for this topic is available [here]().
