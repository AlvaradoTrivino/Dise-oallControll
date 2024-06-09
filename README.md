## Diseño Controller
ste código de Java define una aplicación JavaFX que organiza diversos controles de interfaz de usuario dentro de un AnchorPane. La aplicación contiene elementos de interfaz como Button, CheckBox, Hyperlink, RadioButton, Label, TextField, PasswordField, TextArea, ProgressIndicator, ProgressBar y Slider. A continuación se presenta una explicación en párrafos sobre la estructura y el propósito del código:
## Presnetacion
![](https://github.com/AlvaradoTrivino/Dise-oallControll/blob/main/Captura%20de%20pantalla%20(152).png)
## Explicacion
La clase DisenoCotrollers extiende Application y sobreescribe el método start, que es el punto de entrada principal para cualquier aplicación JavaFX. Dentro del método start, se crea un AnchorPane, que sirve como el contenedor raíz para los componentes de la interfaz de usuario.

Varios controles de interfaz de usuario (Button, CheckBox, Hyperlink, RadioButton, Label, TextField, PasswordField, TextArea, ProgressIndicator, ProgressBar y Slider) son instanciados y configurados. Para cada control, se crea un Label asociado que describe el control correspondiente. Todos estos controles y etiquetas se añaden al AnchorPane.

El AnchorPane permite posicionar los controles en ubicaciones específicas utilizando los métodos setTopAnchor y setLeftAnchor. Esto se hace para cada control y etiqueta, especificando su posición en el AnchorPane con valores en píxeles. Por ejemplo, el botón se posiciona a 30 píxeles desde la parte superior y 200 píxeles desde la izquierda.

Además, el tamaño del TextArea se ajusta para ser más pequeño con el método setPrefSize. En este caso, se establece un tamaño preferido de 200 píxeles de ancho y 100 píxeles de alto.

Finalmente, se crea una escena (Scene) con el AnchorPane como su contenido, y esta escena se establece en el Stage principal (primaryStage). El título de la ventana se establece como "Diseño de Controll" y se muestra la ventana principal con primaryStage.show().


