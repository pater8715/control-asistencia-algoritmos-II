
package model;


public class AssistanceList {
    private final String date;
    public AssistanceList(String date) {
      this.date = date;
    }

    public String getDate() {
        return date;
    }

    public Assistance[] createAssistanceList(Course course){
        Assistance[] assistanceList = new Assistance[course.size()];
        for(int i = 0; i < assistanceList.length; i++){
            assistanceList[i]= new Assistance();
            assistanceList[i].setStudent(course.getStudent(i));
        }
        return assistanceList;
    }

}
