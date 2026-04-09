package interfaces;

interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Real AES would involve SecretKeySpec and Cipher classes
        String encrypted = "AES-ENCRYPTED(" + data + ")";
        System.out.println("Using AES to encrypt...");
        return encrypted;
    }

    @Override
    public String decrypt(String encryptedData) {
        System.out.println("Using AES to decrypt...");
        return encryptedData.replace("AES-ENCRYPTED(", "").replace(")", "");
    }
}

class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Real RSA would involve PublicKey/PrivateKey pairs
        String encrypted = "RSA-ENCRYPTED(" + data + ")";
        System.out.println("Using RSA (Asymmetric) to encrypt...");
        return encrypted;
    }

    @Override
    public String decrypt(String encryptedData) {
        System.out.println("Using RSA (Asymmetric) to decrypt...");
        return encryptedData.replace("RSA-ENCRYPTED(", "").replace(")", "");
    }
}