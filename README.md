# Util-
#### 关于Android BaseActivity：
* 在BaseActivity放置通用的简化方法，让所有Activity都继承自BaseActivity即可随时随地使用</br>
* 简化Toast：</br>


        public void shortToast(String message) {
  
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
        public void longToast(String message) {

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    
* 简化startActivity  </br>


        public void startMyActivity(Class<?> cla) {
                
		Intent intent = new Intent(this, cla);
		startActivity(intent);
	}
	
    
#### 关于Android BaseActivity：
