using Xunit;

namespace SampleAPI.UnitTest
{
    public class SampleTest
    {
        [Fact]
        public void Smart_Router_Hello_World()
        {
            Sample sr = new Sample();
            Assert.True(sr.HelloWorld());
        }
    }
}