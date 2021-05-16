import com.sun.tools.jconsole.JConsoleContext;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ParseException {
        Cliente c1 = new Cliente(1, "Marlene Milena Evelyn Castro", "Avenida Rio Oiapoque, 361, Macapá - AP", "159.290.744-02");
        Cliente c2 = new Cliente(2, "Larissa Jaqueline Figueiredo", "Rua Lago Pantanal, 427, Paulo Afonso - BA", "624.385.276-84");
        Cliente c3 = new Cliente(3, "Vicente Henry Costa", "Rua da Sorveira, 239, Natal - RN", "512.296.500-59");

        for (Cliente cliente : Arrays.asList(c1, c2, c3)){
            System.out.println(cliente);
        }

        MarcaVeiculo m1 = new MarcaVeiculo(1, "Chevrolet");
        MarcaVeiculo m2 = new MarcaVeiculo(2, "Ford");
        MarcaVeiculo m3 = new MarcaVeiculo( 3,"Fiat");
        MarcaVeiculo m4 = new MarcaVeiculo(4,"Jeep");
        MarcaVeiculo m5 = new MarcaVeiculo(5, "Volkswagen");

        for (MarcaVeiculo marca : Arrays.asList(m1,m2,m3,m4,m5)){
            System.out.println(marca);
        }

        ModeloVeiculo mo1 = new ModeloVeiculo(1, m1, "Onix", "Volume de carga: Básica: 303 l / Bancos rebatidos: 1.151 l\\nTanque de combustível: 44 l");
        ModeloVeiculo mo2 = new ModeloVeiculo(2, m2, "Ecosport", "Volume de carga: Básica: 356 - 362 l / Bancos rebatidos: 1.178 l\\nTanque de combustível: 52 l");
        ModeloVeiculo mo3 = new ModeloVeiculo(3, m3, "Uno", "Peso: 988 - 1.057 kg\\nTanque de combustível: 1 - 48 l\\nPotência: 75 - 109 HP");
        ModeloVeiculo mo4 = new ModeloVeiculo( 4, m3, "Toro", "Motor:\t2.0L I4 16v Diesel\\nPotência: D: 170 cv (130 kW) @ 3750 rpm");
        ModeloVeiculo mo5 = new ModeloVeiculo(5, m4, "Renegade", "Volume de carga: Básica: 276 - 320 l / Bancos rebatidos: 1.347 l\\nPeso: 1.448 - 1.674 kg");
        ModeloVeiculo mo6 = new ModeloVeiculo(6, m5, "Gol", "Tanque de combustível: 1 - 55 l\\nVolume de carga: 285 l");

        for (ModeloVeiculo modelo : Arrays.asList(mo1,mo2,mo3,mo4,mo5)){
            System.out.println(modelo);
        }

        Veiculo v1 = new Veiculo(1, m1, mo1, "4 portas, automatico, ar condicionado", "Branco", "HOU-8424");
        Veiculo v2 = new Veiculo(2, m3, mo3, "4 portas, vidro fumê, ar condicionado", "Vermelho", "JYT-7289");
        Veiculo v3 = new Veiculo(3,m3, mo4, "4 portas, vidro fumê, ar condicionado", "Prata", "LWH-7604");
        Veiculo v4 = new Veiculo (4, m5, mo6, "2 portas, automatico, injecao eletrica ar condicionado", "Preto", "LVI-1056");

        for (Veiculo veiculo : Arrays.asList(v1, v2, v3, v4)){
            System.out.println(veiculo);
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Contrato co1 = new Contrato(1, df.parse("2020-03-20"), new BigDecimal("71.29"), v3, c1, new BigDecimal("123.40") );
        Contrato co2 = new Contrato(2, df.parse("2021-08-12"), new BigDecimal("80.59"), v3, c1, new BigDecimal("123.40") );
        Contrato co3 = new Contrato(3, df.parse("2021-01-24"), new BigDecimal("50.19"), v3, c1, new BigDecimal("123.40") );
        Contrato co5 = new Contrato(5, df.parse("2020-09-07"), new BigDecimal("50.09"), v1, c1, new BigDecimal("123.40") );

        for (Contrato contrato : Arrays.asList(co1, co2, co3, co5)){
            System.out.println(contrato);
        }
    }
}
