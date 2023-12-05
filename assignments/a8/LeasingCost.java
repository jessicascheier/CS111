package assignments.a8;
import assignments.a6.StdIn;

public class LeasingCost {
    
    /* 
     * Description:
     *      This method creates an array of Vehicles objects from the given file name
     *      ******IMPORTANT******
     *      This method calls buildVehicle() method, which is STUDENT'S task to complete.
     *
     * Parameters:
     *      filename: the file name containing the vehicles description
     *
     * File format:
     *      the first line of the file containing an integer representing how many vehicles will be described 
     *      in the following lines.
     *      Each line other than the first line describes one vehicle; 
     *      7 or 8 fragments of data in randomly placed order describing the vehicle (7 for gas car, 8 for electric car) in each line. 
     *      Each fragment end with the ';' character
     * 
     *   All possible fragments:
     *      type:FULETYPE;
     *          FULETPE can be gas or electric
     *      name:CARNAME;
     *          CARNAME is the name of the car
     *      due:DUEATSIGNING;
     *          DUEATSIGNING is a double number describing the dollar amount due when signing the lease
     *      length:LEASELENGTH;
     *          LEASELENGTH is an integer number describing the lease length in months
     *      monthly:MONTHLYCOST;
     *          MONTHLYCOST is a double number describing the monthly lease cost in dollar
     *      mile/unit:USAGE; 
     *          USAGE is a double describing miles the car can drive per gallon if fuel type is GAS, or miles the car can drive per kWh if fuel type is ELECTRIC
     *      allowance:MILEAGEALLOWANCE;
     *          MILEAGEALLOWANCE is an integer describing the maximum distance the car is allowed to travel per month
     *      charger:CHARGERCOST;
     *          CHARGERCOST is a double describing the cost of charger for electric cars, this fragment can only appear if the line is describing an electrical car
     *   Example of a line:
     *      type:gas; name:civic; due:1000; length:3; monthly:295; mile/unit:34; 
     *
     * Returns:
     *      this method returns an array of Vehicle objects 
     */
	public static Vehicle[] createAllVehicles(String filename) {
        StdIn.setFile(filename);

        int numberOfCars = Integer.parseInt( StdIn.readLine() );
        Vehicle[] vehicles = new Vehicle[numberOfCars];

        for ( int i = 0; i < numberOfCars; i++ ) {
        	String line = StdIn.readLine();
            vehicles[i] = createVehicle(line);
        }
        return vehicles;
    }

    /* 
     * Description:
     *      This method calculates the CO2 emission given several parameters
     * Parameters:
     *      numberOfMonth: 
     *          the lease length in months
     *      usage: 
     *          miles the car can drive per gallon if fuelType is GAS, or
     *			miles the car can drive per kWh    if fuelType is ELECTRIC
     *      mileageAllowance: 
     *			mileage allowance per month
     *		co2PerUnit:
     *			kg of CO2 released with the combustion of each gallon of gasoline, or
     *			kg of CO2 are emitted to generate 1 kWh on average
     * Returns:
     *      this method returns a double representing the CO2 emission produced by the car during the lease.
     */
	public static double computeCO2(double numberOfMonth, double usage, double mileageAllowance, double co2PerUnit ){
		double miles = numberOfMonth * mileageAllowance ;
		return miles/usage*co2PerUnit;
    }

    /* 
     * Description:
     *      This method calculates the cost the fuel during the lease given several parameters
     * Parameters:
     *      numberOfMonth: 
     *          the lease length in months
     *      usage: 
     *          miles the car can drive per gallon if fuelType is GAS, or
     *			miles the car can drive per kWh    if fuelType is ELECTRIC
     *      mileageAllowance: 
     *			mileage allowance per month
     *		fuelPrice: 
     *			price of 1 kWh in cents of a dollar,  if fuelType is GAS, or
     *			price of one gallon of gas in dollars if fuelType is ELECTRIC
     * Returns:
     *      this method returns a double representing the fuel cost during the lease
     */
	public static double computeFuelCost(double numberOfMonth, double usage, double mileageAllowance, double fuelPrice){
    	double miles = numberOfMonth * mileageAllowance;
        double cost = miles/usage * fuelPrice;
    	return cost;
    }

    /* 
     * Description:
     *      This method calculates the cost of lease
     * Parameters:
     *      dueAtSigning: 
     *          the dollar amount due at signing the lease
     *      numberOfMonths: 
     *          lease length in months
     *      monthlyCost: 
     *			cost of the lease per month
     * Returns:
     *      this method returns a double representing the lease cost during the entire lease
     */
	public static double computeLeaseCost(double dueAtSigning, int numberOfMonths, double monthlyCost){
    	
        return dueAtSigning + numberOfMonths*monthlyCost;
    }

    /* 
     * Description:
     *      This method creates and returns an Vehicle object with name, Lease, and Fuel properly populated based on the given string
     *      
     * Parameters:
     *      one string containing 7~8 fragments descrbing the 
     *   All possible fragments:
     *      type:FULETYPE;
     *          FULETPE can be gas or electric
     *      name:CARNAME;
     *          CARNAME is the name of the car
     *      due:DUEATSIGNING;
     *          DUEATSIGNING is a double number describing the dollar amount due when signing the lease
     *      length:LEASELENGTH;
     *          LEASELENGTH is an integer number describing the lease length in months
     *      monthly:MONTHLYCOST;
     *          MONTHLYCOST is a double number describing the monthly lease cost in dollar
     *      mile/unit:USAGE; 
     *          USAGE is a double describing miles the car can drive per gallon if fuel type is GAS, or miles the car can drive per kWh if fuel type is ELECTRIC
     *      allowance:MILEAGEALLOWANCE;
     *          MILEAGEALLOWANCE is an integer describing the maximum distance the car is allowed to travel per month
     *      charger:CHARGERCOST;
     *          CHARGERCOST is a double describing the cost of charger for electric cars, this fragment can only appear if the line is describing an electrical car
     *   Example of a line:
     *          type:gas.name:civic.due:1000.length:3.monthly:295.mile/unit:34.mileageAllowance:1200.
     *          monthly:238.name:Bolt.due:1000.mileageAllowance:20000.length:15.mile/unit:50.type:electric.charger:500.
     * Returns:
     *      this method creates and returns an Vehicle object with name, Lease, and Fuel properly populated
     *
     * Hint: 
     *      to extract the information of each fragments, we can use 
     *          s.substring(int startIndex, int endIndex) 
     *          s.indexOf(String target)
     *          s.indexOf(char target)
     *
     *      for example, assume we have: 
     *          String s = "description1:ABCD;  description2:EFGH;  description3:IJKL;"
     *      if we want to find the data for description 2, we can first take the substring of the entire string from the letter 'E'
     *      but first we need to find the index of 'E', we can do it by find the index of the string "description2:" and add 13("description2" is 13 chars long)to it
     *      and then we can take the substring from 'E' until the end of the entire string
     *      now use s.substring to extract:
     *          "EFGH;  description3:IJKL;" and let's call it newString for now. 
     *      to extract "EFGH" (the data we want) from newString. we need to find the index of the first ';' which we can simply use newString.indexOf(';')
     *      then we can take the substring of the newString knowing the index of ;
     *      we now have extracted "EFGH" from the String s
     *      the last step is just to convert the datatype based on what type of data we are extracting
     */
	public static Vehicle createVehicle(String description){
        int startName = description.indexOf("name:") + 5;
        String nameString = description.substring(startName);
        int endName = nameString.indexOf(";");
        String name = nameString.substring(0, endName);
        int startDueAtSigning = description.indexOf("due:") + 4;
        String dueAtSigningString = description.substring(startDueAtSigning);
        int endDueAtSigning = dueAtSigningString.indexOf(";");
        double dueAtSigning = Double.parseDouble(dueAtSigningString.substring(0, endDueAtSigning));
        int startLeaseLength = description.indexOf("length:") + 7;
        String leaseLengthString = description.substring(startLeaseLength);
        int endLeaseLength = leaseLengthString.indexOf(";");
        int leaseLength = Integer.parseInt(leaseLengthString.substring(0, endLeaseLength));
        int startMonthlyCost = description.indexOf("monthly:") + 8;
        String monthlyCostString = description.substring(startMonthlyCost);
        int endMonthlyCost = monthlyCostString.indexOf(";");
        double monthlyCost = Double.parseDouble(monthlyCostString.substring(0, endMonthlyCost));
        int startUsage = description.indexOf("mile/unit:") + 10;
        String usageString = description.substring(startUsage);
        int endUsage = usageString.indexOf(";");
        double usage = Double.parseDouble(usageString.substring(0, endUsage));
        int startMileageAllowance = description.indexOf("allowance:") + 10;
        String mileageAllowanceString = description.substring(startMileageAllowance);
        int endMileageAllowance = mileageAllowanceString.indexOf(";");
        int mileageAllowance = Integer.parseInt(mileageAllowanceString.substring(0, endMileageAllowance));
        double chargerCost = 0;
        if (description.indexOf("charger:") != -1) {
            int startChargerCost = description.indexOf("charger:") + 8;
            String chargerCostString = description.substring(startChargerCost);
            int endChargerCost = chargerCostString.indexOf(";");
            chargerCost = Double.parseDouble(chargerCostString.substring(0, endChargerCost));
        }
        Lease lease = new Lease(dueAtSigning, leaseLength, monthlyCost, mileageAllowance);
        Fuel gas = new Fuel(usage);
        Fuel electric = new Fuel(usage, chargerCost);
        Vehicle car = new Vehicle(name, gas, lease);
        Vehicle electricCar = new Vehicle(name, electric, lease);
        if (chargerCost == 0) {
            return car;
        } else {
            return electricCar;
        }
	}

    /* 
     * Description:
     *      The method calculates and assign CO2Emission, FuelCost, leastCost, of each vehicle.
     *      
     * Parameters:
     *      vehicles: 
     *          an array of Vehicle objects, initilized by getVehicles() method
     *      gasPrice: 
     *          a double representing the price of gas in dollar/gallon
     *      electricityPrice: 
     *			a double representing the price of gas in dollar/kWh
     * Hint:
     *      **********REMEMBER charger cost for electric cars***************
     *      feel free to use:
     *          computeCO2(double numberOfMonth, double usage, double mileageAllowance, double co2PerUnit )
     *          computeFuelCost(double numberOfMonth, double usage, double mileageAllowance, double fuelPrice)
     *          computeLeaseCost(double dueAtSigning, int numberOfMonths, double monthlyCost)
     */
	public static void computeCO2EmissionsAndCost( Vehicle[] vehicles, double gasPrice, double electricityPrice ){
        for (int i = 0; i < vehicles.length; i++) {
            Fuel fuel = vehicles[i].getFuel();
            Lease lease = vehicles[i].getLease();
            double usage = fuel.getUsage();
            double mileageAllowance = lease.getMileageAllowance();
            double co2PerUnit;
            double fuelPrice;
            double dueAtSigning = lease.getDueAtSigning();
            int numberOfMonths = lease.getLeaseLength();
            double monthlyCost = lease.getMonthlyCost();
            double leaseCost = computeLeaseCost(dueAtSigning, numberOfMonths, monthlyCost);
            double chargerCost = 0.0;
            if (fuel.getType() == 2) {
                co2PerUnit = Fuel.CO2EMITTED_ELECTRICITYCOMBUSTION;
                chargerCost = fuel.getCharger();
                fuelPrice = computeFuelCost(numberOfMonths, usage, mileageAllowance, electricityPrice);
                vehicles[i].setFuelCost(fuelPrice);
            } else {
                co2PerUnit = Fuel.CO2EMITTED_GASCOMBUSTION;
                fuelPrice = computeFuelCost(numberOfMonths, usage, mileageAllowance, gasPrice);
                vehicles[i].setFuelCost(fuelPrice);
            }
            double totalCost = leaseCost + fuelPrice + chargerCost;
            vehicles[i].setTotalCost(totalCost);
            vehicles[i].setCO2Emission(computeCO2(numberOfMonths, usage, mileageAllowance, co2PerUnit));
        }
        // COMPLETE THIS METHOD
    	}


    /**
     * How to compile:
     *     javac LeasingCost.java
     * How to run:         
     *     java LeasingCost vehicles.txt 3.85 11.0
     **/
	public static void main (String[] args) {
        String filename         = args[0];
        double gasPrice 		= Double.parseDouble( args[1] );
		double electricityPrice = Double.parseDouble( args[2] );

		Vehicle[] vehicles = createAllVehicles(filename); 
		computeCO2EmissionsAndCost(vehicles, gasPrice, electricityPrice);

		for ( Vehicle v : vehicles ) 
            System.out.println(v.toString());
    }
}
