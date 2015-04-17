# URL-Checker-based-on-DFA(Deterministic Pushdown Automata)

let @= {a, b, c, . . . , z}

let E=@ âˆª {.} where E(epsilon) means the set of symbols that can only be used

<b>
S1 = {www.}
</b><b>


S2 = @@âˆ—, which consists of strings over @ of positive lengthí°€ of positive length
</b><b>


S3 = {.com} âˆª {.co.jp}
</b><b>

L1 = S1 S2 S3
</b><b>

L2 = S2 S3
</b><b>

L = L1 âˆª L2
</b>

DFA image 

![alt tag](https://github.com/virajbhalala/URL-Checker-based-on-DFA/blob/master/DFA.png)


If you need  help about DFA, please go here http://en.wikipedia.org/wiki/Deterministic_finite_automaton

This can be easily be modify by changing the grammer rules and chaning code based on it.

