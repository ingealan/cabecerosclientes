package servicios;

import modelos.Clientes;

import java.util.Arrays;
import java.util.List;

public class ClientesServiceImplement implements ClientesServices {
    @Override
    public List<Clientes> listar() {
        return Arrays.asList(
                new Clientes(1, "Carlos Díaz", "Av. Siempre Viva 742, Springfield", "DNI", "98765432"),
                new Clientes(2, "Lucía Martín", "Calle Mar Azul 205, Madrid", "Pasaporte", "45678901"),
                new Clientes(3, "Sofía González", "Calle del Sol 365, Barcelona", "Cédula", "23456789"),
                new Clientes(4, "Fernando Pérez", "Calle del Río 480, Valencia", "DNI", "34567890"),
                new Clientes(5, "Clara Rodríguez", "Calle de la Luna 22, Bilbao", "Pasaporte", "56789012"),
                new Clientes(6, "Martín García", "Av. Los Pinos 801, Sevilla", "DNI", "67890123"),
                new Clientes(7, "Isabel Fernández", "Calle Nuevo Horizonte 303, Salamanca", "Cédula", "78901234"),
                new Clientes(8, "Miguel Álvarez", "Calle del Viento 157, Málaga", "Pasaporte", "89012345"),
                new Clientes(9, "Pablo Jiménez", "Calle Santa Teresa 12, Zaragoza", "DNI", "90123456"),
                new Clientes(10, "Raquel Torres", "Avenida del Mar 789, Alicante", "Cédula", "12345678")
        );
    }

}
