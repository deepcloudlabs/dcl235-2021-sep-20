import com.example.service.RandomNumberService;
import com.example.service.business.FastRandomNumberService;
import com.example.service.business.SecureRandomNumberService;

module com.example.random {
	exports com.example.service;
	provides RandomNumberService with SecureRandomNumberService, FastRandomNumberService;
}