public class PokemonAlreadyExistsException extends Exception {
    Pokemon duplicate;

    
    public PokemonAlreadyExistsException() {
        super("Error! Pokemon Already Exists in Box!");
    }

    public PokemonAlreadyExistsException(String message, Pokemon duplicate) {
        super(message + "Duplicate Pokemon = " + duplicate);
        this.duplicate = duplicate;
    }

    public Pokemon getDuplicate() {
        return this.duplicate;
    }
}