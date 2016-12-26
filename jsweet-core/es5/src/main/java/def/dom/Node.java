package def.dom;
public class Node extends EventTarget {
    public NamedNodeMap attributes;
    public String baseURI;
    public NodeList childNodes;
    public Node firstChild;
    public Node lastChild;
    public String localName;
    public String namespaceURI;
    public Node nextSibling;
    public String nodeName;
    public double nodeType;
    public String nodeValue;
    public Document ownerDocument;
    public HTMLElement parentElement;
    public Node parentNode;
    public String prefix;
    public Node previousSibling;
    public String textContent;
    native public Node appendChild(Node newChild);
    native public Node cloneNode(Boolean deep);
    native public double compareDocumentPosition(Node other);
    native public Boolean hasAttributes();
    native public Boolean hasChildNodes();
    native public Node insertBefore(Node newChild, Node refChild);
    native public Boolean isDefaultNamespace(String namespaceURI);
    native public Boolean isEqualNode(Node arg);
    native public Boolean isSameNode(Node other);
    native public String lookupNamespaceURI(String prefix);
    native public String lookupPrefix(String namespaceURI);
    native public void normalize();
    native public Node removeChild(Node oldChild);
    native public Node replaceChild(Node newChild, Node oldChild);
    native public Boolean contains(Node node);
    public double ATTRIBUTE_NODE;
    public double CDATA_SECTION_NODE;
    public double COMMENT_NODE;
    public double DOCUMENT_FRAGMENT_NODE;
    public double DOCUMENT_NODE;
    public double DOCUMENT_POSITION_CONTAINED_BY;
    public double DOCUMENT_POSITION_CONTAINS;
    public double DOCUMENT_POSITION_DISCONNECTED;
    public double DOCUMENT_POSITION_FOLLOWING;
    public double DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC;
    public double DOCUMENT_POSITION_PRECEDING;
    public double DOCUMENT_TYPE_NODE;
    public double ELEMENT_NODE;
    public double ENTITY_NODE;
    public double ENTITY_REFERENCE_NODE;
    public double NOTATION_NODE;
    public double PROCESSING_INSTRUCTION_NODE;
    public double TEXT_NODE;
    public static Node prototype;
    public Node(){}
    native public Node cloneNode();
    native public Node insertBefore(Node newChild);
}
