public class SuccessCalculator
{
    private String cohort;
    private double gradRate;
    private String borough;
    // Delete me and add more instance variables here
    
    /**
     * Constructor for a Stop, Question, & Frisk report.
     * 
     * @param row An array of Strings that represents a SINGLE ROW of a 
     * Stop, Question, & Frisk database. Each String in the array is a SIGNLE 
     * VALUE of a single column of the database. See the Stop, Question, &
     * Frisk data specification to determine which index in the String 
     * corresponds to which column in the data.
     */
    public SuccessCalculator(String[] row)
    {
        cohort = row[4];
        gradRate = Double.parseDouble(row[10]);
        borough = row[1];
        // Continue storing instance varaibles
        // Be sure to convert to appropriate type
    }
    
    /**
     * Accessor for x-coordinate of a Stop, Question, & Frisk report.
     * 
     * @return the x-coordinate of the Stop, Question, & Frisk report.
     */
    public String getCohort()
    {
        return cohort;
    }
    
    /**
     * Accessor for y-coordinate of a Stop, Question, & Frisk report.
     * 
     * @return the y-coordinate of the Stop and Frisk data point.
     */
    public double getGradRate()
    {
        return gradRate;
    }
    
    public String getBorough()
    {
       return borough;
    }
    
    /**
     * Returns a String representation of Stop, Question, & Frisk report. 
     */
    public String toString()
    {
        return "Cohort: " + cohort + "\n" +
               "From the " + borough + "\n" +
               "Cohort has a: " + gradRate + "% Graduation Rate";
        // Continue updating this to return a String
        // with all the values of all the instance variables
    }
    
    /**
     * Quick test of methods on SQFReport
     */
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
