# :notebook: Padrões de Projeto

Material de estudo sobre padrões de projeto GOF.

### Padrões Criacionais

| Padrões Criacionais                                       | Intenção                                                                 |
|-----------------------------------------------------------|--------------------------------------------------------------------------|
| :mount_fuji: [Factory Method][#factoryMethod] 	        | O padrão de projeto Factory Method define uma interface para criar objetos, permitindo que as subclasses possam decidir qual classe instanciar, possibilitando que uma classe seja capaz de prorrogar a instanciação de uma classe para as subclasses. |
| :dna: [Abstract Factory][#abstractFactory] 	            | O padrão de projeto Abstract Factory fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. |
| :construction_worker: [Builder][#builder]                 | O padrão de projeto Builder separa a construção de um objeto complexo de sua representação de modo que o mesmo processo de construção de um objeto possa criar diferente representações. |


### Padrões Estruturais

| Padrões Estruturais                                       | Intenção                                                                 |
|-----------------------------------------------------------|--------------------------------------------------------------------------|
| :electric_plug: [Adapter][#adapter] 	                    | O padrão de projeto Adapter converte a interface de uma classe para outra interface que o cliente espera encontrar. O Adaptador permite que classes com interfaces incompatíveis  trabalhem juntas. |
| :ice_cream: [Decorator][#decorator] 	                    | O padrão de projeto Decorator anexa responsabilidades individuais a um objeto dinamicamente. Os Decoradores fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades. |
| :gift: [Facade][#facade] 	                                | O padrão de projeto Facade fornece uma interface unificada para um conjunto de interfaces em um subsistema. O Facade define uma internface de nível mais alto que facilita a utilização de um subsitema. |
| :bridge_at_night: [Bridge][#bridge] 	                    | O padrão de projeto Bridge desacopla uma abstração de sua implementação, ou seja, permite dividir uma classe grande ou um conjunto de classes diretamente ligadas em duas hierarquias separadas, deste modo as duas hierarquias pode varias de forma independente. |
| :herb: [Composite][#composite] 	            | O padrão de projeto Composite permite a composição de objetos em estruturas de árvore para representar hierarquias parte-todo. Com esse padrão, os clientes podem tratar os objetos individuais ou composições de objetos de maneira transparente e uniforme. |



O padrão composite permite a composição de objetos em estruturas de
árvore para representar hierarquias parte-todo. Com esse padrão, os
clientes podem tratar objetos individuais ou composições de objetos de
maneira transparente e uniforme.


### Padrões Comportamentais

| Padrões Comportamentais                                   | Intenção                                                                 |
|-----------------------------------------------------------|--------------------------------------------------------------------------|
| :bulb: [Strategy][#strategy] 	                            | O padrão de projeto Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. O Strategy permite que o algoritmo varie independetemente dos clientes que o utilizam.         |
| :pencil: [Template Method][#templatemethod] 	            | O padrão de projeto Template Method define o esqueleto de uma algoritmo dentro de um método, transferindo alguns de seus passos para subclasses. O Template Method permite que as subclasses definam certos passos de um algoritmo sem alterar a estrutura do mesmo. |
| :eyes: [Observer][#observer] 	                            | O padrão de projeto Observer define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda seu estado, todos seus dependentes são notificados e atualizados automaticamente. |
| :sun_behind_rain_cloud: [State][#state]                   | O padrão de projeto State permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado de classe. |
| :link: [Chain of Responsibility][#ChainofResponsibility]  | O padrão de projeto Chain of Responsibility evita o acoplamento do remetente de uma solicitação ao seu receptor, dando a mais de um objeto a oportunidade de tratar a solicitação. Ele encadeia os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate. |
| :loop: [Iterator][#iterator]                              | O padrão de projeto Iterator fornece uma maneira de acessar, sequencialmente, os elementos de uma objeto agregado sem expor a sua representação subjacente. |


[#factoryMethod]: src/main/java/designpatterns/criacionais/factorymethod/
[#abstractFactory]: src/main/java/designpatterns/criacionais/abstractfactory/
[#builder]: src/main/java/designpatterns/criacionais/builder/

[#adapter]: src/main/java/designpatterns/estruturais/adapter/
[#decorator]: src/main/java/designpatterns/estruturais/decorator/
[#facade]: src/main/java/designpatterns/estruturais/facade/
[#bridge]: src/main/java/designpatterns/estruturais/bridge/
[#composite]: src/main/java/designpatterns/estruturais/composite/


[#strategy]: src/main/java/designpatterns/comportamentais/strategy/
[#templatemethod]: src/main/java/designpatterns/comportamentais/templatemethod/
[#observer]: src/main/java/designpatterns/comportamentais/observer/
[#state]: src/main/java/designpatterns/comportamentais/state/
[#ChainofResponsibility]: src/main/java/designpatterns/comportamentais/chainofresponsibility/
[#iterator]: src/main/java/designpatterns/comportamentais/iterator/
