# utilsDialog
It is a useful tool for dialogue.

[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.me/jvmartinez)
# Configuration
* Add repository 
<pre>
  <code>
  android{
      allprojects {
      repositories {        
        maven { url 'https://jitpack.io' }
      }
    }
  }
  </code>
</pre>
* Add dependencies 
<pre>
  <code>
  dependencies{
	com.github.jvmartinez:utilsDialog:0.1.1
	}
  </code>
</pre>
#### then sync gradle
# How to use
* Dialog Simple 
Display only message to user
<pre>
  <code>
    alert.alert("Title","Message","Context");
  </code>
</pre>
* Dialog Simple with button
<pre>
  <code>
    alert.alert("Title","Message","onClickListenerOk","onClickListenerCancel","Context");
  </code>
</pre>
* Dialog Custom 

<pre>
  <code>
    alertCustom custom = new alertCustom("Context","Title","Message","onClickListenerOk","onClickListenerCancel","typeIco");
    custom.openDialogo();
  </code>
</pre>
1) typeIco<br /> 
1.1) The value 1 is for affirmative message<br />
1.2) The value 2 is for warning message<br />
1.3) The value 3 is for info message<br />
1.4) The value 4 is for error message<br />

## Contribution
 *Your contribution will help us to improve this project.*

[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.me/jvmartinez)

