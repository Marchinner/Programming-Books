public class PhraseOMatic {
    public static void main(String[] args) {

        // make three sets of words to choose from.
        String[] wordListOne = {
                "agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive",
                "agent based", "functional", "AI enabled", "strongly typed"
        };

        String[] wordListTwo = {
                "loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native",
                "service oriented", "containerized", "serverless", "microservices", "distributed ledger"
        };

        String[] wordListThree = {
                "framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architeture",
                "perspective", "design", "orientation"
        };

        // find out how many words are in each list
        int listOneLength = wordListOne.length;
        int listTwoLength = wordListTwo.length;
        int listThreeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(listOneLength);
        int rand2 = randomGenerator.nextInt(listTwoLength);
        int rand3 = randomGenerator.nextInt(listThreeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the generated phrase
        System.out.println("What we need is a " + phrase);
    }
}
