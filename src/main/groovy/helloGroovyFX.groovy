import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder

//
// Program starts here - This app is super awesome from lenovo
//
GroovyFX.start {
    def sg = new SceneGraphBuilder()

    sg.stage(title: "GroovyFX Hello World", visible: true) {
        scene(fill: black, width: 650, height: 450) {
            hbox(padding: 80) {
                text(text: "Groovy", style: "-fx-font-size: 80pt") {
                    fill linearGradient(endX: 0, stops: [palegreen, seagreen])
                }
                text(text: "FX", style: "-fx-font-size: 80pt") {
                    fill linearGradient(endX: 0, stops: [cyan, dodgerblue])
                    effect dropShadow(color: dodgerblue, radius: 25, spread: 0.25)
                }
            }
        }
    }
}
