package ClassAll.class1106;

public enum Season {
    TEST,
    spring("spring"),
    summer("summer"),
    autumn("autumn"),
    winter("winter");
    private String message;

    Season(String message) {
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    Season() {

    }
}
