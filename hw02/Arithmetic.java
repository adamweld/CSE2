// Adam Weld
// Sun 07 Sep 2014 09:24:42 PM EDT
// CSE2
//
public class Arithmetic { //create class
	public static void main(String[] args) { //create main method
	// Input declarations
		int nSocks = 3; //number of pairs of socks
		double sockCost$ = 2.58; //cost per pair of socks
		int nGlasses = 6; //number of drinking glasses
		double glassCost$ = 2.29; //cost per glass
		int nEnvelopes = 1; //number of envelopes
		double envelopeCost$ = 3.25; //cost per box of envelopes
		double taxPercent = 0.06; //tax percentage cost
	// Calculation declarations
		// Totals calculations (without sales tax)
		// Multiply item cost by number of items
		double totalSocksCost$ = nSocks * sockCost$;
		double totalGlassesCost$ = nGlasses * glassCost$;
		double totalEnvelopesCost$ = nEnvelopes * envelopeCost$;
		// Sales tax calculations
		// Multiply total cost by sales tax
		double taxSocksCost$ = totalSocksCost$ * taxPercent;
		double taxGlassesCost$ = totalGlassesCost$ * taxPercent;
		double taxEnvelopesCost$ = totalEnvelopesCost$ * taxPercent;
		// Totals calculations including sales tax
		double finalSocksCost$ = totalSocksCost$ * taxSocksCost$;
		double finalGlassesCost$ = totalGlassesCost$ * taxGlassesCost$;
		double finalEnvelopesCost$ = totalEnvelopesCost$ * taxEnvelopesCost$;
	// Output print statements
		// Glasses
		System.out.println("Item: Socks");
		System.out.println("Number of item:              $"+nSocks);
		System.out.println("Cost per item:               $"+sockCost$);
		System.out.println("Total cost before sales tax: $"+totalSocksCost$);
		System.out.println("Sales tax on item(s):        $"+taxSocksCost$);
		System.out.println("Total cost before sales tax: $"+finalSocksCost$);
		// Glasses
		System.out.println("Item: Glasses");
		System.out.println("Number of item:              $"+nGlasses);
		System.out.println("Cost per item:               $"+glassCost$);
		System.out.println("Total cost before sales tax: $"+totalGlassesCost$);
		System.out.println("Sales tax on item(s):        $"+taxGlassesCost$);
		System.out.println("Total cost before sales tax: $"+finalGlassesCost$);
		// Envelopes
		System.out.println("Item: Envelopes");
		System.out.println("Number of item:              $"+nEnvelopes);
		System.out.println("Cost per item:               $"+envelopeCost$);
		System.out.println("Total cost before sales tax: $"+totalEnvelopesCost$);
		System.out.println("Sales tax on item(s):        $"+taxEnvelopesCost$);
		System.out.println("Total cost before sales tax: $"+finalEnvelopesCost$);
	}
}

