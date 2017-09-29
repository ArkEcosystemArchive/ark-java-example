import io.ark.core.*;

/**
 * An example of a Java App using the ark-java library
 */
public class JavaApp
{
    private static final String PASSPHRASE = "this is a top secret passphrase";
    private static final String GREETING = "Welcome to the ARK Java Example";

    public static void main(String[] args)
    {
        System.out.println(GREETING);

        //Get a mainnet account
        Crypto.setNetworkVersion(Network.getMainnet().getPrefix());
        System.out.println(newAddressFromPassphrase(PASSPHRASE));

        //Get a devnet accont
        Crypto.setNetworkVersion(Network.getDevnet().getPrefix());
        System.out.println(newAddressFromPassphrase(PASSPHRASE));

        //Create a transaction on the devnet account
        System.out.println(createDummyTransaction(PASSPHRASE));
    }

    public static String newAddressFromPassphrase(String passphrase)
    {
        return Crypto.getAddress(Crypto.getKeys(passphrase));
    }

    public static Transaction createDummyTransaction(String passphrase)
    {
        return Transaction.createTransaction("AN7BURQn5oqBRBADeWhmmUMJGQTy5Seey3", 100000000000L, "vendorField", passphrase);
    }

    /**
     * Included to demonstrate testing
     *
     * @return a greeting
     */
    public String getGreeting()
    {
        return GREETING;
    }
}
