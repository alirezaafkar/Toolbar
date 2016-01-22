# Toolbar
Android toolbar with layout direction support

## Screenshots

<img src="/Preview.JPG"/>


##Getting started

### Dependency

```
dependencies {
    compile 'com.alirezaafkar:toolbar:1.0.1'
}
```

### Usage

Use the Toolbar in layout file, you can add customized attributes here.

```xml
<com.alirezaafkar.toolbar.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:background="?attr/colorPrimary"
                app:direction="rtl"
                app:contextMenu="@menu/menu_main"
                app:font="@string/font_path"
                app:navigationIcon="@drawable/ic_menu"
                app:popupTheme="@style/AppTheme.PopupOverlay"
                app:title="@string/app_name"/>
```

#Licence

    Copyright 2015 Alireza Afkar
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
