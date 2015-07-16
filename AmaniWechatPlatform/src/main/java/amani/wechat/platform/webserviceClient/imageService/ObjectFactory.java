
package amani.wechat.platform.webserviceClient.imageService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the amani.wechat.platform.webserviceClient.imageService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UploadedFileItemErrorMsg_QNAME = new QName("http://WeiXin.model.amani.com", "errorMsg");
    private final static QName _UploadedFileItemUrl_QNAME = new QName("http://WeiXin.model.amani.com", "url");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: amani.wechat.platform.webserviceClient.imageService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContainsFileResponse }
     * 
     */
    public ContainsFileResponse createContainsFileResponse() {
        return new ContainsFileResponse();
    }

    /**
     * Create an instance of {@link UploadFileResponse }
     * 
     */
    public UploadFileResponse createUploadFileResponse() {
        return new UploadFileResponse();
    }

    /**
     * Create an instance of {@link UploadedFileItem }
     * 
     */
    public UploadedFileItem createUploadedFileItem() {
        return new UploadedFileItem();
    }

    /**
     * Create an instance of {@link UploadFile }
     * 
     */
    public UploadFile createUploadFile() {
        return new UploadFile();
    }

    /**
     * Create an instance of {@link GetFileUrl1 }
     * 
     */
    public GetFileUrl1 createGetFileUrl1() {
        return new GetFileUrl1();
    }

    /**
     * Create an instance of {@link GetFilesResponse }
     * 
     */
    public GetFilesResponse createGetFilesResponse() {
        return new GetFilesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ContainsFile }
     * 
     */
    public ContainsFile createContainsFile() {
        return new ContainsFile();
    }

    /**
     * Create an instance of {@link GetFiles }
     * 
     */
    public GetFiles createGetFiles() {
        return new GetFiles();
    }

    /**
     * Create an instance of {@link GetFileUrlResponse }
     * 
     */
    public GetFileUrlResponse createGetFileUrlResponse() {
        return new GetFileUrlResponse();
    }

    /**
     * Create an instance of {@link GetBucketsResponse }
     * 
     */
    public GetBucketsResponse createGetBucketsResponse() {
        return new GetBucketsResponse();
    }

    /**
     * Create an instance of {@link GetFileUrl1Response }
     * 
     */
    public GetFileUrl1Response createGetFileUrl1Response() {
        return new GetFileUrl1Response();
    }

    /**
     * Create an instance of {@link GetBuckets }
     * 
     */
    public GetBuckets createGetBuckets() {
        return new GetBuckets();
    }

    /**
     * Create an instance of {@link GetFileUrl }
     * 
     */
    public GetFileUrl createGetFileUrl() {
        return new GetFileUrl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeiXin.model.amani.com", name = "errorMsg", scope = UploadedFileItem.class)
    public JAXBElement<String> createUploadedFileItemErrorMsg(String value) {
        return new JAXBElement<String>(_UploadedFileItemErrorMsg_QNAME, String.class, UploadedFileItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeiXin.model.amani.com", name = "url", scope = UploadedFileItem.class)
    public JAXBElement<String> createUploadedFileItemUrl(String value) {
        return new JAXBElement<String>(_UploadedFileItemUrl_QNAME, String.class, UploadedFileItem.class, value);
    }

}
