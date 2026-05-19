package br.edu.ifsc;

public class MediaOptica extends AbstractMedia{
    public MediaOptica(String descricao, String nomeArtista, String nomeAlbum, Integer duracao){
        super(descricao, nomeArtista, nomeAlbum, duracao);
    }

    @Override
    public TipoEnum getTipo() {
        return TipoEnum.OPTICA;
    }
}
