 transition.xml 用来定义两张图片的过渡
 ImageView 直接加载 transition.xml，确保 src 赋值正确
 TransitionDrawable.startTransition(2000) 让图片平滑过渡

运行后点击按钮，图片将在 2 秒内从 image1 变为 image2 
