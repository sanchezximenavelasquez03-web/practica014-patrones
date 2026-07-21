# ☕ Tienda de Café — Patrón Observer

## 📋 Descripción del problema

En una tienda de café, cada vez que el estado de un pedido cambia,
múltiples sistemas necesitan enterarse al instante:

- 🖥️ **Pantalla del cliente** → para que sepa cuándo está listo su pedido
- 👨‍🍳 **Barista** → para saber qué debe preparar
- 💰 **Caja** → para registrar el avance del pedido

Sin un patrón adecuado, el objeto `Pedido` tendría que conocer
y llamar manualmente a cada sistema, generando un acoplamiento
alto y código difícil de mantener.

## ✅ Solución

Se aplica el patrón de diseño **Observer**, donde el objeto `Pedido`
notifica automáticamente a todos los sistemas suscritos cada vez
que su estado cambia:
Recibido → En preparación → Listo

Esto desacopla el pedido de los sistemas que lo escuchan, permitiendo
agregar o quitar observadores sin modificar la lógica central.

## 🗂️ Estructura del proyecto

cafeteria-observer/
├── src/
│ └── cafeteria/
│ ├── Observador.java ← Interfaz observador
│ ├── Sujeto.java ← Interfaz sujeto
│ ├── Pedido.java ← Sujeto concreto
│ ├── PantallaCliente.java ← Observador concreto
│ ├── Barista.java ← Observador concreto
│ ├── Caja.java ← Observador concreto
│ └── Main.java ← Clase principal
└── README.md


## 🏗️ Diagrama de clases
<img width="6803" height="4670" alt="image" src="https://github.com/user-attachments/assets/5a655959-14f6-48ae-923d-d5782d34c0d3" />

## ▶️ Cómo ejecutar

```bash
# Compilar
javac -d out src/cafeteria/*.java

# Ejecutar
java -cp out cafeteria.Main
```

## 🖥️ Salida esperada

=== TIENDA DE CAFE - PATRON OBSERVER ===

-- Cambiando estado a: Recibido --
[Pantalla Cliente] Pedido #101 - Estado: Recibido
[Barista] Pedido #101 - Estado: Recibido
[Caja] Pedido #101 - Estado: Recibido

-- Cambiando estado a: En preparacion --
[Pantalla Cliente] Pedido #101 - Estado: En preparacion
[Barista] Pedido #101 - Estado: En preparacion
[Caja] Pedido #101 - Estado: En preparacion

-- Cambiando estado a: Listo --
[Pantalla Cliente] Pedido #101 - Estado: Listo
[Barista] Pedido #101 - Estado: Listo
[Caja] Pedido #101 - Estado: Listo


## 🎨 Patrón aplicado: Observer

| Rol | Clase |
|-----|-------|
| Sujeto (interfaz) | `Sujeto` |
| Sujeto concreto | `Pedido` |
| Observador (interfaz) | `Observador` |
| Observadores concretos | `PantallaCliente`, `Barista`, `Caja` |
