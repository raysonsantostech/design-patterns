# :notebook: Padrões de Projeto

Material de estudo sobre padrões de projeto GOF.

### Padrões Estruturais

| Padrões Estruturais                               | Intenção                                                                 |
|---------------------------------------------------|--------------------------------------------------------------------------|
| :electric_plug: [Adapter][#adapter] 	            | O padrão de projeto Adapter converte a interface de uma classe para outra interface que o cliente espera encontrar. O Adaptador permite que classes com interfaces incompatíveis  trabalhem juntas. |
| :ice_cream: [Decorator][#decorator] 	            | O padrão de projeto Decorator anexa responsabilidades individuais a um objeto dinamicamente. Os Decoradores fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades. |
| :gift: [Facade][#facade] 	                  | O padrão de projeto Facade fornece uma interface unificada para um conjunto de interfaces em um subsistema. O Facade define uma internface de nível mais alto que facilita a utilização de um subsitema. |



### Padrões Comportamentais

| Padrões Comportamentais                           | Intenção                                                                 |
|---------------------------------------------------|--------------------------------------------------------------------------|
| :bulb: [Strategy][#strategy] 	                    | O padrão de projeto Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. O Strategy permite que o algoritmo varie independetemente dos clientes que o utilizam. |
| :pencil: [Template Method][#templatemethod] 	    | O padrão de projeto Template Method define o esqueleto de uma algoritmo dentro de um método, transferindo alguns de seus passos para subclasses. O Template Method permite que as subclasses definam certos passos de um algoritmo sem alterar a estrutura do mesmo. |
| :eyes: [Observer][#observer] 	                    | O padrão de projeto Observer define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda seu estado, todos seus dependentes são notificados e atualizados automaticamente. |
| :sun_behind_rain_cloud: [State][#state]           | O padrão de projeto State permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado de classe. |


[#adapter]: src/main/java/designpatterns/estruturais/adapter/
[#decorator]: src/main/java/designpatterns/estruturais/decorator/
[#facade]: src/main/java/designpatterns/estruturais/facade/


[#strategy]: src/main/java/designpatterns/comportamentais/strategy/
[#templatemethod]: src/main/java/designpatterns/comportamentais/templatemethod/
[#observer]: src/main/java/designpatterns/comportamentais/observer/
[#state]: src/main/java/designpatterns/comportamentais/state/
