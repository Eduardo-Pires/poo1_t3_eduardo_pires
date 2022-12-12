public class Triangulo extends FormaBidimensional
{
        private double b;
        private double h;

        public Triangulo(double b, double h) {
            this.b = b;
            this.h = h;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getH() {
            return h;
        }

        public void setH(double h) {
            this.h = h;
        }

        @Override
        public double obterArea() {
            return (this.b * this.h);
        }

    @Override
    void imprimeForma() {
        System.out.println("Triângulo");
        super.imprimeForma();
    }
}
