#JavaFX Demo

####打包成exe
```shell
jpackage --type app-image -n HelloJFX -p . -m com.zb.jfxdemo/com.zb.jfxdemo.HelloApplication --vendor bo --app-version 1.0.0 --icon .\logo.ico
```


####模块化运行
```shell
java --module-path ./lib --add-modules=javafx.controls,javafx.fxml,javafx.base -jar JFXdemo-1.0.0.jar
```