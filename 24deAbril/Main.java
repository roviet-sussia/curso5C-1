public class Main {

    public static void main(String[] args) {
        
        Plato plato1 = new Plato()
            .setNombre("Polenta con salsa Fileto")
            .setMesa(1)
            .setCantidad(2)
            .setPedido(1);

        Mesa mesa1 = new Mesa();

        Sucursal succ1 = new Sucursal();

        mesa1.agregarPedidoDeClienteActual(plato1);
        succ1.agregarMesa(mesa1);
        succ1.agregarPlatoAPreparar(plato1);

        Plato plato2 = new Plato()
            .setNombre("Arroz primavera")
            .setMesa(1)
            .setCantidad(1)
            .setPedido(2);

        mesa1.agregarPedidoDeClienteActual(plato2);
        succ1.agregarMesa(mesa1);
        succ1.agregarPlatoAPreparar(plato2);

        System.out.print("TEST cantPlatosSegunTipo. Caso deberia dar 2. ");
        int nombreVar1 = 2;
        int nombreVar2 = succ1.cantPlatosSegunTipo("Polenta con salsa Fileto");
        System.out.println((nombreVar1==nombreVar2)?"Pasó el test.":"No pasó el test.");

        System.out.print("TEST platoMasPedido. Caso deberia dar Polenta con salsa Fileto. ");
        String a = "Polenta con salsa Fileto";
        String b = succ1.platoMasPedido();
        System.out.println((a.equals(b))?"Pasó el test.":"No pasó el test.");

        System.out.print("TEST platoMenosPedido. Caso deberia dar Arroz primavera. ");
        String c = "Arroz primavera";
        String d = succ1.platoMenosPedido();
        System.out.println((c.equals(d))?"Pasó el test.":"No pasó el test.");
    }
}