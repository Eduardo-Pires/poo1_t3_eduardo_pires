public class CamaroteSuperior extends VIP
{
        private String localIngresso;

        public CamaroteSuperior(float valorBase, float adicional, String localIngresso)
        {
                super(valorBase, adicional);
                this.localIngresso = localIngresso;
        }

        public float getValorFinal()
        {
                return valorFinal;
        }
}
