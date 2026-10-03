async function sendBookingSMS(userPhone, userName) {
  const response = await fetch('https://api.sms-provider.com/send', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({
      apiKey: 'YOUR_API_KEY',
      to: userPhone,
      message: `أهلاً ${userName}، تم استلام حجزك في مطعم صبحي كابر بنجاح! سنقوم بالتواصل معك قريباً.`
    })
  });
}
