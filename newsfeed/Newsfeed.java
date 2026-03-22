
public class Newsfeed {
  public Newsfeed(){
      
  }
      public class Newsfeed {
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  public int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){
  
  }
    
  public String[] getTopics(){
    return topics;
  }
  
  // getFirstTopic() below
  public String getFirstTopic() {
    return topics[0];
  }

  
  public void viewTopic(int topicIndex){
    
  }
}
  // getTopics() below:
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
}