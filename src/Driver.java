
public class Driver {

	public static void main(String[] args) {

		String plaintext="0599714454";
		//encryption
		Encryption encryption=new Encryption(plaintext, "inorder");
		String ciphertext=encryption.getCipherText();
		System.out.println("Cipher text="+ciphertext);
		//decription
		Decryption decryption=new Decryption(ciphertext,  "inorder");
		plaintext=decryption.getPlaintext();
		System.out.println("Plaintext="+plaintext);
	}

}
