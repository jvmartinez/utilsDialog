# utilsDialog
It is a useful tool for dialogue.
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
