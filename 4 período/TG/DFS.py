grafo = {
        "A": ["B", "C", "D"],
        "B": ["A", "H"],
        "C": ["A", "D", "F"],
        "D": ["A", "C"],
        "E": ["D"],
        "H" : ["B","I", "J" ],
        "I": ["H"],
        "J": ["H"],
        "F": ["C"]       
}

visitados = set()
subgrafo = []
profundo = 0

def profundidade(v_atual, v_procurado, visitados, subgrafo, grafo):
    global profundo 
    profundo += 1
    
    if v_atual == v_procurado:
        visitados.add(v_atual)
        subgrafo.append(v_atual)
        return True
    
    encontrado = False
    visitados.add(v_atual)
    subgrafo.append(v_atual)

    encontrado = False
    for v in grafo[v_atual]:

        if v not in visitados:
            encontrado = profundidade(v, v_procurado, visitados, subgrafo, grafo)

            if encontrado == True: 
                break
        
    if encontrado == True:
       return True
    else:
        subgrafo.pop() 
        return False

visitados.clear()
subgrafo.clear()

if profundidade("A", "J", visitados, subgrafo, grafo):
    print("Caminho encontrado:", subgrafo,"profundidade:", profundo)
else:
    print("Vértice não encontrado.")