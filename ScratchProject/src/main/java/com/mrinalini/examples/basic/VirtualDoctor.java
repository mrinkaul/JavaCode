package com.mrinalini.examples.basic;

public class VirtualDoctor {
    public static String DIAGNOSIS_COVID = "COVID 19";
    public static String DIAGNOSIS_COMMON_COLD = "COMMON COLD";
    public static String DIAGNOSIS_UNKNOWN = "UNKNOWN";

    public static String diagnose(Boolean fever,
                                  Boolean sneezing,
                                  Boolean coughing,
                                  Boolean vomiting,
                                  Boolean diarriea) {
        if (fever && coughing)
            return DIAGNOSIS_COVID;
        if (!fever && sneezing)
            return DIAGNOSIS_COMMON_COLD;

        return DIAGNOSIS_UNKNOWN;
    }



    // Test Main method (not really used)
    public static void main(String[] args) {
        System.out.println(VirtualDoctor.diagnose(true, false, true, false, false));
        System.out.println(VirtualDoctor.diagnose(false, false, true, false, false));
    }
}
