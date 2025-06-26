public enum CoursePhase {
    NOT_STARTED ("Course not started yet"),
    ONGOING ("Course is in progress"),
    FINISHED ("Course has ended");


    private String Message;

     CoursePhase (String Message){
        this.Message = Message;

    }

    public String getMessage() {
        return Message;
    }
}
