import io.ark.core.Crypto
import io.ark.core.Network
import io.ark.core.Transaction

/**
 * An example of a Kotlin App using the ark-java library
 */
class KotlinApp
{
    val PASSPHRASE = "this is a top secret passphrase"
    val GREETING = "Welcome to the ARK Kotlin Example"

    fun main(args: Array<String>)
    {
        println(GREETING)

        //Get a mainnet account
        Crypto.setNetworkVersion(Network.getMainnet().prefix)
        println(newAddressFromPassphrase(PASSPHRASE))

        //Get a devnet account
        Crypto.setNetworkVersion(Network.getDevnet().prefix)
        println(newAddressFromPassphrase(PASSPHRASE))

        println(createDummyTransaction(PASSPHRASE))
    }

    fun newAddressFromPassphrase(passphrase: String): String
    {
        return Crypto.getAddress(Crypto.getKeys(passphrase))
    }

    fun createDummyTransaction(passphrase: String): Transaction
    {
        return Transaction.createTransaction("AN7BURQn5oqBRBADeWhmmUMJGQTy5Seey3",
                100000000000L, "vendorField", passphrase)
    }
}