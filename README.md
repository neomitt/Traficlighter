# Traficlighter

Traficlighter on android studio

![Screenshot](https://github.com/neomitt/Traficlighter/blob/main/screen.png)

## The traffic lights change color when you click on them. Made with invisible buttons

![Пример гифки](https://github.com/neomitt/Traficlighter/blob/main/video_2023-12-01_21-26-54%20(1).gif)

## Code fragment
```java
private LinearLayout mLila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLila = findViewById(R.id.LinearLayout1);
    }
    public void onClick(View v){
        int id = v.getId();
        if(id == R.id.buttonred1){
            mLila.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        }
        else if(id == R.id.buttongreen3){
            mLila.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }
        else if(id == R.id.buttonyellow2){
            mLila.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        }
    }
```
### [Github teachers: gomarmadi](https://github.com/gomarmadi)
