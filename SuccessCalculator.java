public class SuccessCalculator
{
    private String cohort;
    private double gradRate;
    private String borough;
    
    public SuccessCalculator(String[] row)
    {
        cohort = row[4];
        gradRate = Double.parseDouble(row[10]);
        borough = row[1];
        // Continue storing instance varaibles
        // Be sure to convert to appropriate type
    }
    
    public String getCohort()
    {
        return cohort;
    }
    
    public double getGradRate()
    {
        return gradRate;
    }
    
    public String getBorough()
    {
       return borough;
    }
    
    public String toString()
    {
        return "Cohort: " + cohort + "\n" +
               "From the " + borough + "\n" +
               "Cohort has a: " + gradRate + "% Graduation Rate";
        // Continue updating this to return a String
        // with all the values of all the instance variables
    }

    public static void main(String[] args)
    {
        String[] exInputData = new String[109];
        exInputData[4] = "4 Year August";
        exInputData[10] = "57.8";
        exInputData[1] = "Bronx";
        
        SuccessCalculator testReport = new SuccessCalculator(exInputData);
        
        System.out.println("Cohort = " + testReport.getCohort());
        System.out.println("Graduation Rate = " + testReport.getGradRate() + "%");
        System.out.println("Borough = " + testReport.getBorough());
        System.out.println(testReport.toString());
        // As you define instance variables and methods,
        // test them here to make sure they work.
    }
}
