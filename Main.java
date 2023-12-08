// Diagnosing the Flu                  A+CR
class Main {
  private String name;
  private int age;
  private double temperature;
  private String symptoms;

  Public FluDiagnoser(String n, int a, double t, String s) {
    name = n;
    age = a;
    temperature = t;
    symptoms = s;
  }
  public void changeSymptions(String symptoms)
  {
    newSymptoms = symptoms;
  }
  public string getSymptoms()
  {
    return symptoms;
  }
  public String toString()
  {
    return name + " Should be tested for the Flu due to their " + temperature + " temperature and " + symptoms;
  }
  public static void main(String[] args) {
    if (temperature > 100.4)
    {
      
    }
		FluDiagnoser tester = new FluDiagnoser("Alice", 23, 102, "aching muscles and fatigue");
		System.out.println(tester);
    tester.toString();
  }
}
